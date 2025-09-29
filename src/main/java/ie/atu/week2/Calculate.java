package ie.atu.week2;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.sql.SQLOutput;

public class Calculate {
  private String operation;
  private double total;
    public Calculate(String operation, double total) {
      this.operation = operation;
      this.total = total;
    }

    public String getOperation() {
        return operation;
    }

    public double getTotal() {
        return total;
    }

}
