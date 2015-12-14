/**
 * Stores all of the song objects and a list of them all
 * 
 * @author Abby Lambert
 * @version 1.0.0
 */
public class SongMap
{
    private Song[] songList;

    /**
     * Constructor for the SongMap class
     */
    public SongMap()
    {
        songList = new Song[69];
    }

    /**
     * Initializes all of the songs and stores them in the master list of songs
     */
    public void init()
    {
        //Country
        Song cowboyCassanova = new Song("Songs\\Country\\01_Cowboy_Casanova_1.wav", "Cowboy Cassanova", "Carrie Underwood", "country", 233, false, "Covers\\play_on.jpg");
        songList[0] = cowboyCassanova;
        Song whenWeStand = new Song("Songs\\Country\\03_When_We_Stand_Together.wav", "When We Stand Together", "Nickelback", "country", 190, false, "Covers\\nickleback.jpg");
        songList[1] = whenWeStand;
        Song needYouNow = new Song("Songs\\Country\\01_Need_You_Now_Live_At_the_52nd_Gr.wav", "Need You Now", "Lady Antebellum", "country", 205, false, "Covers\\needyounow.jpg");
        songList[2] = needYouNow;
        Song undoIt = new Song("Songs\\Country\\05_Undo_It_1.wav", "Undo It", "Carrie Underwood", "country", 177, false, "Covers\\play_on.jpg");
        songList[3] = undoIt;
        Song youBelong = new Song("Songs\\Country\\06_You_Belong_With_Me.wav", "You Belong With Me", "Taylor Swift", "country", 231, false, "Covers\\fearless.png");
        songList[4] = youBelong;

        //Alternative
        Song radioactive = new Song("Songs\\Alternative\\01_Radioactive.wav", "Radioactive", "Imagine Dragons", "alternative", 186, false, "Covers\\night_visions.jpg");
        songList[5] = radioactive;
        Song shakeItOut = new Song("Songs\\Alternative\\02_Shake_It_Out.wav", "Shake It Out", "Florence + the Machine", "alternative", 277, false, "Covers\\ceremonials.jpg");
        songList[6] = shakeItOut;
        Song mountainSound = new Song("Songs\\Alternative\\03_Mountain_Sound.wav", "Mountain Sound", "Of Monsters and Men", "alternative", 211, false, "Covers\\my_head_is_an_animal.jpg");
        songList[7] = mountainSound;
        Song hopelessWanderer = new Song("Songs\\Alternative\\09_Hopeless_Wanderer.wav", "Hopeless Wanderer", "Mumford & Sons", "alternative", 307, false, "Covers\\babel.jpg");
        songList[8] = hopelessWanderer;
        Song feelGood = new Song("Songs\\Alternative\\06_Feel_Good_Inc.wav", "Feel Good Inc.", "Gorillaz", "alternative", 221, false, "Covers\\deamon_days.jpg");
        songList[9] = feelGood;
        Song cosmicLove = new Song("Songs\\Alternative\\09_Cosmic_Love.wav", "Cosmic Love", "Florence + the Machine", "alternative", 255, false, "Covers\\lungs.jpg");
        songList[10] = cosmicLove;
        Song speedOfSound = new Song("Songs\\Alternative\\07_Speed_of_Sound.wav", "Speed of Sound", "Coldplay", "alternative", 288, false, "Covers\\xy.jpg");
        songList[11] = speedOfSound;
        Song lionMan = new Song("Songs\\Alternative\\07_Little_Lion_Man.wav", "Little Lion Man", "Mumford & Sons", "alternative", 245, false, "Covers\\babel.jpg");
        songList[12] = lionMan;
        Song vivaLaVida = new Song("Songs\\Alternative\\07_Viva_la_Vida_1.wav", "Viva La Vida", "Coldplay", "alternative", 241, false, "Covers\\viva_la_vida.jpg");
        songList[13] = vivaLaVida;

        //Rock
        Song careful = new Song("Songs\\Rock\\01 Careful.wav", "Careful", "Paramore", "rock", 0, false, "Covers\\brand_new_eyes.jpg");
        songList[14] = careful;
        Song realWorld = new Song("Songs\\Rock\\10 Real World 1.wav", "Real World", "Matchbox 20", "rock", 0, false, "Covers\\exile_on_mainstream.jpg");
        songList[15] = realWorld;
        Song figureItOut = new Song("Songs\\Rock\\01 Figure It Out.wav", "Figure It Out", "Royal Blood", "rock", 0, false, "Covers\\royal_blood.jpg");
        songList[16] = figureItOut;
        Song misery = new Song("Songs\\Rock\\01 Misery 1.wav", "Misery", "Maroon 5", "rock", 0, false, "Covers\\hands_all_over.jpg");
        songList[17] = misery;
        Song miracle = new Song("Songs\\Rock\\01 The Miracle (Of Joey Ramone).wav", "The Miracle (Of Joey Ramone)", "U2", "rock", 0, false, "Covers\\songs_of_innocence.jpg");
        songList[18] = miracle;
        Song insideOut = new Song("Songs\\Rock\\02 Inside Out.wav", "Inside Out", "Eve 6", "rock", 0, false, "Covers\\eve6.jpg");
        songList[19] = insideOut;
        Song mySongs = new Song("Songs\\Rock\\02 My Songs Know What You Did In the.wav", "My Songs Know What You Did In the Dark", "Fall Out Boy", "rock", 0, false, "Covers\\save_rock_and_roll.jpg");
        songList[20] = mySongs;
        Song dance = new Song("Songs\\Rock\\03 Dance, Dance.wav", "Dance, Dance", "Fall Out Boy", "rock", 0, false, "Covers\\under_the_cork_tree.jpg");
        songList[21] = dance;
        Song dropsOfJupiter = new Song("Songs\\Rock\\03 Drops of Jupiter.wav", "Drops of Jupiter", "Train", "rock", 0, false, "Covers\\drops_of_jupiter.jpg");
        songList[22] = dropsOfJupiter;
        Song youFoundMe = new Song("Songs\\Rock\\03 You Found Me.wav", "You Found Me", "The Fray", "rock", 0, false, "Covers\\the_fray.jpg");
        songList[23] = youFoundMe;
        Song gonnaGoFar = new Song("Songs\\Rock\\03 You're Gonna Go Far, Kid.wav", "You're Gonna Go Far, Kid", "The Offspring", "rock", 0, false, "Covers\\rise_and_fall.jpg");
        songList[24] = gonnaGoFar;
        Song boulevard = new Song("Songs\\Rock\\04 Boulevard of Broken Dreams.wav", "Boulevard of Broken Dreams", "Green Day & Broadway Cast", "rock", 0, false, "Covers\\american_idiot.jpg");
        songList[25] = boulevard;
        Song jumper = new Song("Songs\\Rock\\04 Jumper.wav", "Jumper", "Third Eye Blind", "rock", 0, false, "Covers\\third_eye_blind.jpg");
        songList[26] = jumper;
        Song miseryBusiness = new Song("Songs\\Rock\\04 Misery Business.wav", "Misery Business", "Paramore", "rock", 0, false, "Covers\\riot.jpg");
        songList[27] = miseryBusiness;
        Song sheWill = new Song("Songs\\Rock\\04 She Will Be Loved 1.wav", "She Will Be Loved", "Maroon 5", "rock", 0, false, "Covers\\songs_about_jane.jpg");
        songList[28] = sheWill;
        Song smellsLike = new Song("Songs\\Rock\\05 Smells Like Teen Spirit.wav", "Smells Like Teen Spirit", "Nirvana", "rock", 0, false, "Covers\\nevermind.jpg");
        songList[29] = smellsLike;
        Song theKids = new Song("Songs\\Rock\\05 The Kids Aren't Alright.wav", "The Kids Aren't Alright", "The Offspring", "rock", 0, false, "Covers\\americana.jpg");
        songList[30] = theKids;
        Song whatsMyAge = new Song("Songs\\Rock\\05 What's My Age Again.wav", "What's My Age Again?", "Blink-182", "rock", 0, false, "Covers\\enema_of_the_state.jpg");
        songList[31] = whatsMyAge;
        Song otherside = new Song("Songs\\Rock\\06 Otherside.wav", "Otherside", "Red Hot Chili Peppers", "rock", 0, false, "Covers\\californiacation.jpg");
        songList[32] = otherside;
        Song strangerThings = new Song("Songs\\Rock\\06 Stranger Things Have Happened.wav", "Stranger Things Have Happened", "Foo Fighters", "rock", 0, false, "Covers\\echos_silence.jpg");
        songList[33] = strangerThings;
        Song allAround = new Song("Songs\\Rock\\07 All Around Me.wav", "All Around Me", "Flyleaf", "rock", 0, false, "Covers\\flyleaf.jpg");
        songList[34] = allAround;
        Song basketCase = new Song("Songs\\Rock\\07 Basket Case.wav", "Basket Case", "Green Day", "rock", 0, false, "Covers\\dookie.jpg");
        songList[35] = basketCase;
        Song selfEsteem = new Song("Songs\\Rock\\08 Self Esteem.wav", "Self Esteem", "The Offspring", "rock", 0, false, "Covers\\smash.jpg");
        songList[36] = selfEsteem;
        Song iWriteSins = new Song("Songs\\Rock\\10 I Write Sins Not Tragedies.wav", "I Write Sins Not Tragedies", "Panic! At the Disco", "rock", 0, false, "Covers\\a_fever.jpg");
        songList[37] = iWriteSins;
        
        //pop
        Song justCant = new Song("Songs\\Pop\\14 Just Can't Get Enough 1.wav", "Just Can't Get Enough", "Black Eyed Peas", "pop", 0, false, "Covers\\thebeginning.jpg");
        songList[38] = justCant;
        Song breakaway = new Song("Songs\\Pop\\01 Breakaway.wav", "Breakaway", "Kelly Clarkson", "pop", 0, false, "Covers\\breakaway.png");
        songList[39] = breakaway;
        Song payphone = new Song("Songs\\Pop\\01 Payphone.wav", "Payphone", "Maroon 5 feat. Wiz Kalifa", "pop", 0, false, "Covers\\overexposed.jpg");
        songList[40] = payphone;
        Song rolling = new Song("Songs\\Pop\\01 Rolling in the Deep.wav", "Rolling in the Deep", "Adele", "pop", 0, false, "Covers\\21.jpg");
        songList[41] = rolling;
        Song stereo = new Song("Songs\\Pop\\01 Stereo Hearts.wav", "Stereo Hearts", "Gym Class Heros feat. Adam Levine", "pop", 0, false, "Covers\\stereo_hearts.jpg");
        songList[42] = stereo;
        Song girlsAt = new Song("Songs\\Pop\\01 Where Them Girls At.wav", "Where Them Girls At", "David Guetta", "pop", 0, false, "Covers\\nothing_but_the_beat.jpg");
        songList[43] = girlsAt;
        Song dontLet = new Song("Songs\\Pop\\02 Don't Let Me Get Me (Radio Edit).wav", "Don't Let Me Get Me", "P!nk", "pop", 0, false, "Covers\\misunderstood.jpg");
        songList[44] = dontLet;
        Song imYours = new Song("Songs\\Pop\\02 I'm Yours.wav", "I'm Yours", "Jason Mraz", "pop", 0, false, "Covers\\we_sing.png");
        songList[45] = imYours;
        Song hipsDont = new Song("Songs\\Pop\\03 Hips Don't Lie.wav", "Hips Don't Lie", "Shakira", "pop", 0, false, "Covers\\oral.jpg");
        songList[46] = hipsDont;
        Song somebody = new Song("Songs\\Pop\\03 Somebody that I Used to Know.wav", "Somebody That I Used to Know", "Gotye", "pop", 0, false, "Covers\\making_mirrors.jpg");
        songList[47] = somebody;
        Song pokerFace = new Song("Songs\\Pop\\04 Poker Face.wav", "Poker Face", "Lady Gaga", "pop", 0, false, "Covers\\the_fame.png");
        songList[48] = pokerFace;
        Song breakeven = new Song("Songs\\Pop\\05 Breakeven (Falling to Pieces).wav", "Breakeven (Falling to Pieces)", "The Script", "pop", 0, false, "Covers\\the_script.jpg");
        songList[49] = breakeven;
        Song iGotta = new Song("Songs\\Pop\\05 I Gotta Feeling 1.wav", "I Gotta Feeling", "Black Eyed Peas", "pop", 0, false, "Covers\\end.jpg");
        songList[50] = iGotta;
        Song rightRound = new Song("Songs\\Pop\\05 Right Round.wav", "Right Round", "Flo Rida", "pop", 0, false, "Covers\\roots.jpg");
        songList[51] = rightRound;
        Song hotNCold = new Song("Songs\\Pop\\07 Hot N Cold.wav", "Hot N Cold", "Katy Perry", "pop", 0, false, "Covers\\oneoftheboys.jpg");
        songList[52] = hotNCold;
        Song someone = new Song("Songs\\Pop\\11 Someone Like You.wav", "Someone Like You", "Adele", "pop", 0, false, "Covers\\21.jpg");
        songList[53] = someone;
        Song disturbia = new Song("Songs\\Pop\\13 Disturbia.wav", "Disturbia", "Rhianna", "pop", 0, false, "Covers\\good_girl.jpg");
        songList[54] = disturbia;

        //Metal
        Song sandman = new Song("Songs\\Metal\\01 Enter Sandman.wav", "Enter Sandman", "Metallica", "metal", 0, false, "Covers\\metallica.jpg");
        songList[55] = sandman;
        Song headstrong = new Song("Songs\\Metal\\01 Headstrong.wav", "Headstrong", "Trapt", "metal", 0, false, "Covers\\trapt.jpg");
        songList[56] = headstrong;
        Song rising = new Song("Songs\\Metal\\04 Dead But Rising.wav", "Dead But Rising", "Volbeat", "metal", 0, false, "Covers\\outlaw_gentlemen.jpg");
        songList[57] = rising;
        Song neverTooLate = new Song("Songs\\Metal\\04 Never Too Late.wav", "Never Too Late", "Three Days Grace", "metal", 0, false, "Covers\\onex.jpg");
        songList[58] = neverTooLate;
        Song devil = new Song("Songs\\Metal\\04 The Devil In I.wav", "The Devil In I", "Slipknot", "metal", 0, false, "Covers\\.5.jpg");
        songList[59] = devil;
        Song bulls = new Song("Songs\\Metal\\05 Bulls in the Bronx.wav", "Bulls in the Bronx", "Pierce the Veil", "metal", 0, false, "Covers\\collide_with.jpg");
        songList[60] = bulls;
        Song movingOn = new Song("Songs\\Metal\\10 Moving On.wav", "Moving On", "Asking Alexandria", "metal", 0, false, "Covers\\from_death.jpg");
        songList[61] = movingOn;
        Song broken = new Song("Songs\\Metal\\20 Broken (feat. Amy Lee).wav", "Broken (feat. Amy Lee)", "Seether", "metal", 0, false, "Covers\\disclaimer.jpg");
        songList[62] = broken;
        
        //Electronic
        Song sail = new Song("Songs\\Electronic\\10 Sail.wav", "Sail", "AWOLNATION", "electronic", 0, false, "Covers\\megalithic.jpg");
        songList[63] = sail;
        Song name = new Song("Songs\\Electronic\\01 Say My Name (Feat. Zyra).wav", "Say My Name", "ODEZA feat. Zyra", "electronic", 0, false, "Covers\\inreturn.jpg");
        songList[64] = name;
        Song chambermaid = new Song("Songs\\Electronic\\2-10 Chambermaid Swing.wav", "Chambermaid Swing", "Parov Stelar", "electronic", 0, false, "Covers\\thatswing.jpg");
        songList[65] = chambermaid;
        Song kids = new Song("Songs\\Electronic\\05 Kids.wav", "Kids", "MGMT", "electronic", 0, false, "Covers\\oracular.jpg");
        songList[66] = kids;
        Song fireflies = new Song("Songs\\Electronic\\09 Fireflies.wav", "Fireflies", "Owl City", "electronic", 0, false, "Covers\\oceaneyes.jpg");
        songList[67] = fireflies;
        Song booty = new Song("Songs\\Electronic\\03 Booty Swing.wav", "Booty Swing", "Parov Stelar", "electronic", 0, false, "Covers\\theprincess.jpg");
        songList[68] = booty;
    }
    
    /**
     * @return the list of songs
     */
    public Song[] getSongList()
    {
        return songList;
    }

    
}
