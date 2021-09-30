package pers.chenjiahao.builder.review.exam1;

/**
 * @Author ChenJiahao
 * @Date 2021/8/1 23:23
 */
public interface TerrainBuilder {
    TerrainBuilder buildWall();
    TerrainBuilder buildFort();
    TerrainBuilder buildMine();
    Terrain build();
}
