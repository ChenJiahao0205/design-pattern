package pers.chenjiahao.builder.review.exam1;

/**
 * @Author ChenJiahao
 * @Date 2021/8/1 23:28
 */
public class Main {
    public static void main(String[] args) {
        TerrainBuilder terrainBuilder = new ComplexTerrainBuilder();
        Terrain build = terrainBuilder.buildFort().buildMine().buildWall().build();
        System.out.println(build);
    }
}
