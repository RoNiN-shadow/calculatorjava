public class Check {
    public void checking() {
        switch (Main.action) {
            case 1:
                pluss kuk = new pluss();
                kuk.dodat();
                break;
            case 2:
                vidnim muk = new vidnim();
                muk.vidnimm();
                break;
            case 3:
                dilin lol = new dilin();
                lol.dilen();
                break;
            case 4:
                mnoj pop = new mnoj();
                pop.mojina();
                break;
            default:
                System.out.println("Thisis not a option!");

        }
    }
}