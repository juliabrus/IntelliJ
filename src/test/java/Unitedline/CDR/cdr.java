package Unitedline.CDR;

import Pages.CDR;
import Pages.Menu;
import Pages.WebDriverSettingUL;
import org.junit.Test;

public class cdr extends WebDriverSettingUL {
    @Test
    public void inbound() throws InterruptedException {
        Menu menu = new Menu();
        CDR cdr = new CDR();

        menu.openCDR();
        cdr.selectTypeInbound();
        cdr.searchCDR();
        cdr.openCDR();
    }
}
