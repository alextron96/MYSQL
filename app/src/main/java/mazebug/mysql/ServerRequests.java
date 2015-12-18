package mazebug.mysql;

import android.app.ProgressDialog;
import android.content.Context;
/**
 * Created by Provorny on 12/13/2015.
 */
public class ServerRequests {
            ProgressDialog progressDialog ;
            public static final int CONNECTION_TIME = 1000 * 15;
            public final String SERVER_ADDRESS ="http://daniksql.cumlu.com";

    public ServerRequests(Context context){
        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Processing");
        progressDialog.setMessage("Please wait...");


    }
    public void storeUserDataInBackground(){

    }

    public void fetchUserDataInBackground(){

    }
}
