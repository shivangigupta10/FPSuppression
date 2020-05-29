st.executeQuery("INSERT into student values("+id+",'"+name+"',"+phone+",'"+pwd+"')");
st.executeQuery("INSERT into student values("+id+",'"+name+"',"+phone+",'"+pwd+"')");
st.executeQuery("INSERT into student values("+id+",'"+name+"',"+phone+",'"+pwd+"')");
st.executeQuery("INSERT into student values("+id+",'"+name+"',"+phone+",'"+pwd+"')");
st.executeQuery("SELECT accountNumber, balance FROM accounts WHERE account_owner_id = " + request.getParameter("user_id")");
st.executeQuery("UPDATE question set q_id="+qid+",ques='"+quest+"',ans="+ans+",author='"+author+"',op1='"+op1+"',op2='"+op2+"',op3='"+op3+"',op4='"+op4+"' where q_id="+qid");
st.executeQuery("DELETE from question where q_id="+qid);
