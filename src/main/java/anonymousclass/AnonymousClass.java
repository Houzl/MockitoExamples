package anonymousclass;

import abstracclass.AbstracClass;

public class AnonymousClass {
    private String messageInOutterClass = "Massage in outter Class";

    public void methodA(){
        AbstracClass abstracClass = new AbstracClass() {
            public String abstractMethod(){
                return "Implement in AnonymousClass.methodA";
            }

            @Override
            public String concrateMethod(){
                return "Overrided in AnonymousClass.methodA";
            }
        };
    }
}
