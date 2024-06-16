public class FactoryProduct {

    public static Product getInstance(ProductTypeEnum productTypeEnum) {
        switch (productTypeEnum) {
            case FISICO -> {
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPhysicalDimensions(true);
                return produtoFisico;
            }
            case DIGITAL -> {
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPhysicalDimensions(false);
                return produtoDigital;
            }
            default -> throw new IllegalArgumentException("Unrecognized product type");

        }
    }
}