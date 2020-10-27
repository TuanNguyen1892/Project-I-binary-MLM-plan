public class Main {
    public static void main(String[] args) {
        Distributor boss = new Distributor("Nguyen Duc Tuan");
        Company company = new Company(boss);

        Distributor d1 = new Distributor("Alisson Becker");
        Distributor d2 = new Distributor("Salah");
        Distributor d3 = new Distributor("Mane");
        Distributor d4 = new Distributor("Jota");
        Distributor d5 = new Distributor("Klopp");
        company.addDistributor(d1, boss);
        company.addDistributor(d2, boss);
        company.addDistributor(d3, boss);
        company.addDistributor(d4, d2);
        company.addDistributor(d5, d3);

        Sale sale = new Sale(company, 120);
        sale.saleResult(boss);
        System.out.println("commission of " + boss.getName() + " is " + sale.commission(boss));
        System.out.println("total products of " + boss.getName() + " is " + sale.totalProducts(boss));

    }

}
