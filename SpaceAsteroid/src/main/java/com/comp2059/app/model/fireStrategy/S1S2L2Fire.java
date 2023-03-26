package com.comp2059.app.model.fireStrategy;

import com.comp2059.app.model.AbstractFactory;
import com.comp2059.app.model.FactoryProducer;
import com.comp2059.app.model.bullet.AbstractBullet;
import com.comp2059.app.model.GameStageModel;
import com.comp2059.app.utils.Direction;
import com.comp2059.app.utils.SoundEffect;

/**
 * Shuttle 1 and shuttle 2 in level 2 will use this fire strategy.
 * The bullets will be fired two lines at a time
 * @author Jiafang Sun
 * @version 2.0
 * @since  20 December 2022
 */
public class S1S2L2Fire implements ShuttleFire{
    public AbstractFactory bulletFactory = FactoryProducer.getFactory("BULLET");
    @Override
    public void fire(double x, double y, Direction direction) {
        double bulletX1 = x + 25;
        double bulletY1 = y - 5;
        AbstractBullet bullet1 = bulletFactory.makeBullet("Bullet2", bulletX1, bulletY1, direction);
        double bulletX2 = x + 65;
        double bulletY2 = y - 5;
        AbstractBullet bullet2 = bulletFactory.makeBullet("Bullet2", bulletX2, bulletY2, direction);
        SoundEffect.playShoot();
        GameStageModel.getGameStage().getBullets().add(bullet1);
        GameStageModel.getGameStage().getBullets().add(bullet2);
    }
}
