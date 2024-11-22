class Mobile {
    // Constructor for Mobile class
    public Mobile() {
        System.out.println("Basic Mobile is Manufactured");
    }

    // Method to indicate basic mobile
    public void basicMobile() {
        System.out.println("Basic Mobile features");
    }
}

class CameraMobile extends Mobile {
    // Constructor for CameraMobile class
    public CameraMobile() {
        // Call the parent class constructor
        super();
        System.out.println("Camera Mobile is Manufactured");
    }

    // Method for camera features
    public void newFeature() {
        System.out.println("Camera Mobile with 5MG px");
    }
}

class AndroidMobile extends CameraMobile {
    // Constructor for AndroidMobile class
    public AndroidMobile() {
        // Call the parent class constructor
        super();
        System.out.println("Android Mobile is Manufactured");
    }

    // Method for Android features
    public void androidMobile() {
        System.out.println("Touch Screen Mobile is Manufactured");
    }
}

public class Mobile1 {
    public static void main(String[] args) {
        // Create an instance of AndroidMobile
        AndroidMobile androidMobile = new AndroidMobile();

        // Call methods to display additional features
        androidMobile.newFeature(); // From CameraMobile
        androidMobile.androidMobile(); // From AndroidMobile
    }
}
