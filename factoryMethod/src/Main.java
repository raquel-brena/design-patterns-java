public class Main {
    public static void main(String[] args) {
       Product produtoDigital = FactoryProduct.getInstance(ProductTypeEnum.DIGITAL);
       Product produtoFisico = FactoryProduct.getInstance(ProductTypeEnum.FISICO);
    }
}