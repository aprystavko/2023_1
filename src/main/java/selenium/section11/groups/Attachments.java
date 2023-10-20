package selenium.section11.groups;

import org.testng.annotations.Test;

public class Attachments {
    @Test(groups = {"regression", "smoke"})
    public void checkAttachment1() {
        System.out.println("checkAttachment1: regression smoke");
    }

    @Test(groups = {"smoke"})
    public void checkAttachment2() {
        System.out.println("checkAttachment2: smoke");
    }

    @Test(groups = {"regression"})
    public void checkAttachment3() {
        System.out.println("checkAttachment3: regression");
    }

    @Test(groups = {"regression", "smoke"})
    public void checkAttachment4() {
        System.out.println("checkAttachment4: regression smoke");
    }

    @Test(groups = {"regression"})
    public void checkAttachment5() {
        System.out.println("checkAttachment5: regression");
    }

}
