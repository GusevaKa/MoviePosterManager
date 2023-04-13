public class FilmManager {
    private String[] films = new String[0];
    private int maxLimitReverse = 5;

    public FilmManager() {

    }

    public FilmManager(int max) {
        maxLimitReverse = max;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (maxLimitReverse > films.length) {
            resultLength = films.length;
        } else {
            resultLength = maxLimitReverse;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }

}