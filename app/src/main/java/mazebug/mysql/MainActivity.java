package mazebug.mysql;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bLogout;
    EditText etName, etUserName, etAge;
    UserLocalStore userLocalStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=(EditText)findViewById(R.id.etName);
        etUserName=(EditText)findViewById(R.id.etUsername);
        etAge=(EditText)findViewById(R.id.etAge);
        bLogout=(Button)findViewById(R.id.bLogout);
        bLogout.setOnClickListener(this);

        userLocalStore = new UserLocalStore(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        }


    private void displayUserDetails() {
        User user = userLocalStore.getLoggedInUser();

        etUserName.setText(user.username);
        etAge.setText(user.age);
        etName.setText(user.name);
    }

    private boolean authenticate(){
        return true;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bLogout:
                userLocalStore.clearUserData();
                userLocalStore.setUserLoggedIn(false);
                startActivity(new Intent(this, Login.class));
                break;
            }
        }
    }

