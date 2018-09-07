package codingwithmitch.com.databindinggettingstarted;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import codingwithmitch.com.databindinggettingstarted.databinding.ActivityMainBinding;
import codingwithmitch.com.databindinggettingstarted.models.Product;
import codingwithmitch.com.databindinggettingstarted.util.BigDecimalUtil;
import codingwithmitch.com.databindinggettingstarted.util.Products;

public class MainActivity extends AppCompatActivity {

  // data binding sample
  ActivityMainBinding mainBinding;

  private Product mproduct;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

    Products products = new Products();
    mproduct = products.PRODUCTS[0];
    mainBinding.setProduct(mproduct);

  }
}
