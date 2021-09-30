package pers.chenjiahao.builder.exam1;

/**
 * 构建器接口
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/22 22:20
 */
public interface TerrainBuilder {
    TerrainBuilder buildWall();
    TerrainBuilder buildFort();
    TerrainBuilder buildMine();
    Terrain build();
}
