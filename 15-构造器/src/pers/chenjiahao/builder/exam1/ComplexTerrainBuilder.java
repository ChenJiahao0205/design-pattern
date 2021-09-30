package pers.chenjiahao.builder.exam1;

/**
 * 构造器接口的实现类
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/22 22:30
 */
public class ComplexTerrainBuilder implements TerrainBuilder {
    Terrain terrain = new Terrain();
    @Override
    public TerrainBuilder buildWall() {
        terrain.w = new Wall(10,10,50,50);
        return this;
    }

    @Override
    public TerrainBuilder buildFort() {
        terrain.f = new Fort(10,10,50,50);
        return this;
    }

    @Override
    public TerrainBuilder buildMine() {
        terrain.m = new Mine(10,10,50,50);
        return this;
    }

    @Override
    public Terrain build() {
        return terrain;
    }
}
