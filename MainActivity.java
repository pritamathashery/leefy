import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Set the layout for this activity

        // Initialize UI components
        TextView welcomeText = findViewById(R.id.welcomeText);
        TextView descriptionText = findViewById(R.id.descriptionText);
        Button startButton = findViewById(R.id.startButton);

        // Example of changing text dynamically (optional)
        welcomeText.setText("Welcome to Leafy!");
        descriptionText.setText("Find plants that thrive in your climate.");

        // Set up button click listener
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When the button is clicked, navigate to another screen
                // Example: navigate to a plant recommendation screen or activity
                Intent intent = new Intent(MainActivity.this, PlantRecommendationActivity.class);
                startActivity(intent);
            }
        });
    }
}
