package pers.chenjiahao.builder.exam1;

/**
 * 测试类
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/22 22:35
 */
public class Test {
    public static void main(String[] args) {
        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain t = builder.buildFort()
                .buildMine()
                .buildWall()
                .build();
        System.out.println(t);
    }
}
