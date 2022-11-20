package JavaFundamentalsCoding19.Task19;

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Kadare", "Shqiptar");
        System.out.println(a1.toString());

        Poem p1 = new Poem(a1, 34);
        System.out.println(p1.toString());

        Author a2 = new Author(); //a2: surname = null, nationality = null
        a2.setSurname("Shakespeare");
        a2.setNationality("Anglez");
        a2.setQyteti("Londer");
        a2.setMosha(54);

        Poem p2 = new Poem(); //p2: creator = null, stropheNumbers = 0
        p2.setCreator(a2);
        p2.setStropheNumber(45);

        Poem p3 = new Poem(new Author("Poradeci", "Shqiptar"), 23);

        Poem[] poemat = new Poem[3]; //[null,null,null]
        poemat[0] = p1; //[p1: a1, 34, null, null]
        poemat[1] = p2; //[p1, p2, null]
        poemat[2] = p3; //[p1, p2, p3]

      //  String mbiemri = getSurnameLongestPoem(poemat);
      //  System.out.println(mbiemri);
        Author author = getAuthorLongestPoem(poemat);
        System.out.println(author.toString());
    }

//    private static String getSurnameLongestPoem(Poem[] poems) {
//        int max = poems[0].getStropheNumber(); //34
//        int index = 0;
//        for(int i = 1; i < poems.length; i++) {
//            if(max < poems[i].getStropheNumber()) {
//                max = poems[i].getStropheNumber();
//                index = i;
//            }
//        }
//
//        String mbiemri = poems[index].getCreator().getSurname();
//        return mbiemri;
//    }

    private static Author getAuthorLongestPoem(Poem[] poems) {
        int max = poems[0].getStropheNumber(); //34
        int index = 0;
        for(int i = 1; i < poems.length; i++) {
            if(max < poems[i].getStropheNumber()) {
                max = poems[i].getStropheNumber();
                index = i;
            }
        }

        Author author = poems[index].getCreator();
        return author;
    }
}
