class p26{
    public static void main(String args[]){
        byte lofpathinmeter=120,lofbreak=24,bofbreak=15;
        double bofpathinmeter=2.4;
        float lofpathincm=(float)(lofpathinmeter*100);
        double bofpathincm=(double)(bofpathinmeter*100);
        double numofbreaks=(double)(lofpathincm*bofpathincm)/(lofbreak*bofbreak);
        System.out.println("number of breaks required to lay a path: "+numofbreaks);
        
    }
}