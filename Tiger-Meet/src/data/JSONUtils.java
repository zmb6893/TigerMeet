package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Converts SQL responses to JSON records
 * @author zmb6893
 */

public class JSONUtils {

    // Constants
    public static final String ANSWERSTABLE = "Answers";
    public static final String MATCHINGTABLE = "Matching";
    public static final String QUESTIONSTABLE = "Questions";
    public static final String USERTABLE = "User";
    public static final String USERMATCHESTABLE = "UserMatches";
    public static final String USERANSWERS = "User_Answers";

    public JSONObject getUser(int user_id, Connection connection){
        // returns {"user_id":1, "Username":"mAiShA", "GoogleID": 12345678901234567890123, "User_Answers_ID":1, "Birthdate":Date(03/06/2002)}
        PreparedStatement query;
        JSONObject obj = new JSONObject();
        try {
            query = connection.prepareStatement(String.format("SELECT * FROM %s WHERE user_id = %d;", USERTABLE, user_id));
            ResultSet res = query.executeQuery();
            
            while (res.next()) {
                obj.put("Username", res.getString("Username"));
                obj.put("GoogleID",res.getInt("GoogleID"));
                obj.put("User_Answers_ID", res.getInt("User_Answers_ID"));
                obj.put("Birthdate", res.getDate("Birthdate"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return obj;
    }
        
}