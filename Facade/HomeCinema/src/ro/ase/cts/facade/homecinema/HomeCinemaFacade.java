package ro.ase.cts.facade.homecinema;

public class HomeCinemaFacade {
    private Televizor televizor = new Televizor();
    private Soundbar soundbar = new Soundbar();
    private BlurayPlayer blurayPlayer = new BlurayPlayer();

    public void pornesteFilm(){
        televizor.porneste();
        televizor.seteazaHDMI();
        soundbar.porneste();
        soundbar.seteazaVolum(20);
        blurayPlayer.porneste();
        blurayPlayer.redaDisc();
    }

    public void opresteFilm(){
        televizor.opreste();
        soundbar.opreste();
        blurayPlayer.opreste();
    }
}
