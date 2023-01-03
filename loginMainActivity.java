import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, pass;
    String u = "ilahia";
    String p = "ilahia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.uname);
        pass = (EditText) findViewById(R.id.pwd);
    }

    public void verify(View v) {
        if (v.getId() == R.id.login) {
            String a = user.getText().toString();
            String b = pass.getText().toString();
            if (a.equals(u) && b.equals(p))
                Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this, "invalid", Toast.LENGTH_LONG).show();
        }
    }
}