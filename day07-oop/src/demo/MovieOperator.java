package demo;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }
    public void printAllMovies() {
        System.out.println("----------系统全部信息如下----------");
        for (int i = 0; i < movies.length; i++) {
            System.out.println("编号: " + movies[i].getId());
            System.out.println("名称: " + movies[i].getName());
            System.out.println("价格: " + movies[i].getPrice());
            System.out.println("------------------");
        }
    }
    public void searchMovieById(int id) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id) {
                System.out.println("该电影详情如下");
                System.out.println("编号: " + movies[i].getId());
                System.out.println("名称: " + movies[i].getName());
                System.out.println("价格: " + movies[i].getPrice());
                System.out.println("得分: " + movies[i].getScore());
                System.out.println("导演: " + movies[i].getDirector());
                System.out.println("主演: " + movies[i].getActor());
                System.out.println("其他信息: " + movies[i].getInfo());
                return;
            }
            System.out.println("没有该电影信息");
        }
    }
}
