import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmTest {

    @Test
    public void ShouldFilmTestAdd() {
        FilmManager manager = new FilmManager(5);

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");

        String[] actual = manager.findAll();
        String[] expected = new String[]{"Movie I", "Movie II", "Movie III", "Movie IV", "Movie V"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFilmTestEmpty() {
        FilmManager manager = new FilmManager(5);
        String[] actual = manager.findAll();
        String[] expected = new String[]{};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastMoreMaximum() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");
        manager.addFilm("Movie VI");

        String[] actual = manager.findLast();
        String[] expected = new String[]{"Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastParam() {
        FilmManager manager = new FilmManager(6);
        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");
        manager.addFilm("Movie VI");

        String[] actual = manager.findLast();
        String[] expected = new String[]{"Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastParamFilms() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");

        String[] actual = manager.findLast();
        String[] expected = new String[]{"Movie IV", "Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

}