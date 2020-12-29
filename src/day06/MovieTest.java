package day06;

class Movie {
    //iv -  멤버변수 - field
    String genre;
    //횟수
    int action;
    int kiss;

    Movie(String genre, int action, int kiss) {
        this.genre = genre;
        //횟수
        this.action = action;
        this.kiss = kiss;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "genre='" + genre + '\'' +
                ", action=" + action +
                ", kiss=" + kiss +
                '}';
    }
}

class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie("멜로", 3, 5);
        System.out.println(m1);

        Movie m2 = new Movie("액션", 3, 5);
        System.out.println(m2);
    }
}
