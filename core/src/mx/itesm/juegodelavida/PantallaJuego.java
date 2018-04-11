package mx.itesm.juegodelavida;

import com.badlogic.gdx.Screen;

/**
 * Clase para simular gráficamente el juego de la vida
 */
class PantallaJuego extends Pantalla
{
    private final Principal principal;

    public PantallaJuego(Principal principal) {
        this.principal = principal;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        borrarPantalla(0,0.2f,0);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
