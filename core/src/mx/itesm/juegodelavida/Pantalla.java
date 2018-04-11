package mx.itesm.juegodelavida;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Representa una pantalla de la aplicación.
 */
public abstract class Pantalla implements Screen
{
    // Atributos disponibles en todas las clases del proyecto
    public static final float ANCHO = 1280;
    public static final float ALTO = 720;

    // Atributos disponibles en las subclases
    // Todas las pantallas tienen una cámara y la vista
    protected OrthographicCamera camara;
    protected Viewport vista;
    // Todas las pantallas dibujan
    protected SpriteBatch batch;

    public Pantalla() {
        camara = new OrthographicCamera(ANCHO, ALTO);
        camara.position.set(ANCHO / 2, ALTO / 2, 0);
        camara.update();
        vista = new StretchViewport(ANCHO, ALTO, camara);
        batch = new SpriteBatch();
    }

    // Borra la pantalla con fondo negro
    protected void borrarPantalla() {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    // Borra la pantalla con el color RGB (r,g,b)
    protected void borrarPantalla(float r, float g, float b) {
        Gdx.gl.glClearColor(r,g,b,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void resize(int width, int height) {
        vista.update(width, height);
    }

    @Override
    public void hide() {
        dispose();  // Libera los recursos asignados por cada pantalla
    }
}