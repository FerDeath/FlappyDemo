package com.energgyonapps.flappydemo.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.energgyonapps.flappydemo.FlappyDemo;

/**
 * Created by fernando.amarilla on 19/01/2016.
 */
public class PlayState extends State {

    private Texture bird;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        bird = new Texture("bird.png");
        cam.setToOrtho(false, FlappyDemo.WIDTH / 2, FlappyDemo.HEIGHT / 2);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bird, 50, 50);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
