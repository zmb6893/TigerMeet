import { User } from './user';

export const USERS: User[] = [
  {  id: 1,
    name: 'Maisha',
    username: 'mAiShA',
    birthday: 'Date(03/06/2002)',
    gender: 'Female',
    clubs: 'Friend club',
    seeking: 'Friendship',
    deaf: false,
    faveEatery: 'Artesanos',
    faveStudy: 'Global Village',
    matches: ['ZOEEEE', 'karara'], 
    imagePath: 'assets/img/maisha.jpg' } ,
    {  id: 2,
        name: 'Kara',
        username: 'karara',
        birthday: 'Date(09/13/2002)',
        gender: 'Female',
        clubs: 'Hate club',
        seeking: 'Enemy',
        deaf: false,
        faveEatery: 'Brick City',
        faveStudy: 'Empty classroom',
        matches: ['ZOEEEE', 'mAiShA'],
        imagePath: 'assets/img/kara.jpg'},
        {  id: 3,
            name: 'Zoe',
            username: 'ZOEEEE',
            birthday: 'Date(08/12/2002)',
            gender: 'Female',
            clubs: 'Vegan club',
            seeking: 'Enemy',
            deaf: false,
            faveEatery: 'Midnight Oil',
            faveStudy: 'Fireside Lounge',
            matches: ['mAiShA', 'karara'],
            imagePath: 'assets/img/zoe.jpg' }
];