package selenium.section11.groups;

import org.testng.annotations.Test;

public class Documents {

    @Test(groups = {"regression", "smoke"})
    public void checkDocument1() {
        System.out.println("checkDocument1: regression smoke");
    }

    @Test(groups = {"smoke"})
    public void checkDocument2() {
        System.out.println("checkDocument2: smoke");
    }

    @Test(groups = {"regression"})
    public void checkDocument3() {
        System.out.println("checkDocument3: regression");
    }

    @Test(groups = {"regression", "smoke"})
    public void checkDocument4() {
        System.out.println("checkDocument4: regression smoke");
    }

    @Test(groups = {"regression"})
    public void checkDocument5() {
        System.out.println("checkDocument5: regression");
    }

}
