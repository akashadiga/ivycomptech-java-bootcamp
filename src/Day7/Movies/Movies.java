package Day7.Movies;

public class Movies {
        private String title;
        private String studio;
        private  String rating;

        public Movies(String title, String studio, String rating) {
            this.title = title;
            this.studio = studio;
            this.rating = rating;
        }
        public Movies(String title, String studio) {
            this.title = title;
            this.studio = studio;
            this.rating = "PG";
        }
        public Movies[] getPG(Movies[] movies){
            Movies[] pgMov = new Movies[movies.length];
            int newArrayIndex=0;
            for(int i=0;i< movies.length;i++){
                if(movies[i].rating.equals("PG")){
                    pgMov[newArrayIndex]=movies[i];
                    newArrayIndex++;
                }
            }
            return pgMov;
        }

    }
