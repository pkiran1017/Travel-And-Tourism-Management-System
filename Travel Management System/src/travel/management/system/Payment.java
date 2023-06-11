package travel.management.system;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Payment extends Application {

    @Override
    public void start(Stage primaryStage) {
        WebView webView = new WebView();
       
        webView.getEngine().loadContent("<form><script src=\"https://checkout.razorpay.com/v1/payment-button.js\" data-payment_button_id=\"pl_M0D8R0qyz0mrwH\" async> </script> </form>");

        StackPane root = new StackPane();
        root.getChildren().add(webView);
        

        Scene scene = new Scene(root, 400, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Payment Gateways");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}