package day06;

import java.util.Arrays;

class Movie {
    //iv -  멤버변수 - field
    String genre;
    //씬 횟수
    int action;
    int kiss;

    //생성자 함수 -> new와 함께 인스턴스를 만들 때
    Movie(String genre, int action, int kiss) {
        this.genre = genre;
        //횟수
        this.action = action;
        this.kiss = kiss;
    }

    double calcDistance(int action, int kiss) {
        return Math.sqrt(Math.pow(this.action - action, 2) + Math.pow(this.kiss - kiss, 2));
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
        Movie[] movies = new Movie[6];
        movies[0] = new Movie("A", 6, 4);
        movies[1] = new Movie("A", 7, 2);
        movies[2] = new Movie("A", 5, 2);
        movies[3] = new Movie("M", 4, 5);
        movies[4] = new Movie("M", 3, 4);
        movies[5] = new Movie("M", 3, 2);

        System.out.println(Arrays.toString(movies));

        //target
        Movie target = new Movie("", 4, 4);
        Arrays.sort(movies, (a, b) -> {
            double disA = a.calcDistance(target.action, target.kiss);
            double disB = a.calcDistance(target.action, target.kiss);

            return disA > disB ? 1 : -1;
        });
        System.out.println(Arrays.toString(movies));
    }
}
