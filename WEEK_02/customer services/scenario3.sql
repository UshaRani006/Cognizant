DECLARE
  v_due_date DATE := SYSDATE + 30;
BEGIN
  FOR loan_rec IN (SELECT customer_id, loan_id, due_date FROM loans 
                   WHERE due_date <= v_due_date) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Customer ' || loan_rec.customer_id ||
                         ', your loan ' || loan_rec.loan_id || 
                         ' is due on ' || TO_CHAR(loan_rec.due_date, 'DD-MON-YYYY'));
  END LOOP;
END;
/
