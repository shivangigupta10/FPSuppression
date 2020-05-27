Poor Logging Practice

System.out.println("ANS IS " + k);
--------------------------------------------------------------------------------
Unvalidated Redirect and forward

response.sendRedirect(redirectURL);
request.getRequestDispatcher(fwd).forward(request, response);
-------------------------------------------------------------------------------
OS Command Injection


Process proc = rt.exec(new String[] {"sh", "-c", "ls " + dir});
-----------------------------------------------------------------------------------------------
Denail of service


while((line=input.readLine())!=null);
--------------------------------------------------------------------------------------------
SQL Injection


//
//
//
//
st.executeQuery("INSERT into student values("+id+",'"+name+"',"+phone+",'"+pwd+"')");
st.executeQuery("SELECT accountNumber, balance FROM accounts WHERE account_owner_id = " + request.getParameter("user_id")");
st.executeQuery("UPDATE question set q_id="+qid+",ques='"+quest+"',ans="+ans+",author='"+author+"',op1='"+op1+"',op2='"+op2+"',op3='"+op3+"',op4='"+op4+"' where q_id="+qid");
st.executeQuery("DELETE from question where q_id="+qid);
------------------------------------------------------------------------------------------------------------------------------------------------
Weak Random


Random ranGen = new Random();
int var_ranGen = ranGen.next ();
-------------------------------------------------------------------------------------------------------------
LDAP Injection

DirContext context = new InitialDirContext(env);
String searchFilter = "StreetAddress=" + address;
NamingEnumeration answer = context.search(searchBase, searchFilter, searchCtls);
----------------------------------------------------------------------------------------------------------------------
XSS


<input type="text" name="t3" value="<%= username %>" size=20 maxlength=20></td>;

@Value("${webwolf.fileserver.location}")

<spring:htmlEscape defaultHtmlEscape="false">

<form:input path="name" htmlEscape="false" />
--------------------------------------------------------------------------------------------------------------------------------------
Security Misconfiguration


e.printStackTrace();
}catch(Exception e){e.printStackTrace();}
-------------------------------------------------------------------------------------------------------------------------------------
XML External Entities


Transformer transformer = TransformerFactory.newInstance().newTransformer();
transformer.transform(input, result);
DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();



/* Load XML stream and display content */
String maliciousSample = "xxe.xml";
XMLInputFactory factory = XMLInputFactory.newInstance(); 

try (FileInputStream fis = new FileInputStream(malicousSample)) {
  // Load XML stream
  XMLStreamReader xmlStreamReader = factory.createXMLStreamReader(fis);  // reader is vulnerable

  //...
-------------------------------------------------------------------------------------------------------------------------------------
Sensitive data exposure


openFileOutput("someFile");
----------------------------------------------------------------------------------------------------------
Weak Cryptoraphy

MessageDigest md = MessageDigest.getInstance("MD5");

Cipher c1 = Cipher.getInstance("AES/ECB/NoPadding"); 
Cipher c2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
Cipher c = Cipher.getInstance("DESede/ECB/PKCS5Padding");
Cipher rsa = javax.crypto.Cipher.getInstance("RSA/NONE/NoPadding");
---------------------------------------------------------------------------------------------------------------------------
CRLF Injection

try {
// Create a default MimeMessage object.
MimeMessage message = new MimeMessage(session);

// Set From: header field of the header.
message.setFrom(from);
---------------------------------------------------------------------------------------------------------------------------
Object Hijack

protected Object clone() throws CloneNotSupportedException {
public Object clone() throws CloneNotSupportedException {
---------------------------------------------------------------------------------------------------------------------------
Reverse Tabnabbing


echo '<li class="userinput"><a href="'.PHPDOC.'reserved.variables.get" target="_blank">$_GET</a></li>'; 
<li><a href="bad.example.com" target="_blank">Vulnerable target using html link to open the new page</a></li> ;

--------------------------------------------------------------------------------------------------------------------------------
Class Loading Injection


static System.loadLibrary("LibFile");

-------------------------------------------------------------------------------------------------------------------------------
Persistent Cookie


Cookie c = new Cookie(SECRET, secret);  // Noncompliant; cookie is not secure
response.addCookie(c);

-------------------------------------------------------------------------------------------------------------------------------
Weak SSL Protocols


context = SSLContext.getInstance("SSL");

----------------------------------------------------------------------------------------------------------------------------
XML External Entities
  
  private void testGetAttributeValueWithNs(String nameSpace, String attrName, Consumer<String> checker) throws Exception {
    XMLInputFactory xif = XMLInputFactory.newInstance();
    XMLStreamReader xsr = xif.createXMLStreamReader(new FileInputStream(testFile));

    while (xsr.hasNext()) {
        xsr.next();
        if (xsr.isStartElement()) {
            String v;
            v = xsr.getAttributeValue(nameSpace, attrName);
            checker.accept(v);
        }
    }
}
 
 
 ----------------------------------------------------------------------------------------------------------------------------
 
 Using Referer Field for Authentication
 
 
 java.util.Enumeration<String> headers = request.getHeaders("Referer");

 
 
 ------------------------------------------------------------------------------------------------------------------------------
 Cookie Security: Sensitive Cookie in HTTPS Session Without Secure Attribute
 
 
 cookie.setSecure(false);
 
unsafeSecureCookie.setSecure(false);
 
 ------------------------------------------------------------------------------------------------------------------------------
 Potential Improper Input Validation
 
 java.util.Map<String,String[]> map = request.getParameterMap();
 Map m=req.getParameterMap();
 Map<String, String> reqMap =(HashMap<String, String>)request.getParameterMap();

--------------------------------------------------------------------------------------------------------------------------------------------
CSRF

@RequestMapping("/greet")  // Noncompliant
public String greet(String greetee) {
}


