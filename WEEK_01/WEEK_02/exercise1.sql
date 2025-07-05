BEGIN
  FOR cust_rec IN (SELECT customer_id, age, loan_interest_rate FROM customers) LOOP
    IF cust_rec.age > 60 THEN
      UPDATE customers
      SET loan_interest_rate = loan_interest_rate * 0.99
      WHERE customer_id = cust_rec.customer_id;
    END IF;
  END LOOP;
  COMMIT;
END;
/
