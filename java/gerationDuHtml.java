package text.java;
import java.io.*; 


public class gerationDuHtml 
{
    String header = "<head> " +
   "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">
   "<link href="../css/style.css\" rel=\"stylesheet\">" 
</head>
<body>
    <div>
      <img src=\"../img/logo.png\" style=\"position: relative;padding-left: 2%;padding-top: 2%;\" alt=\"Logo Go Securi\">
        <h2 style=\"text-align: center;padding: 1%;\" class=\"title\">Profil de Allan OIE</h2>
    </div>
    <div> ";

    String Link = "output/web/"+ Agent.getNickname() + ".html";
    PrintWriter print = new PrintWriter(Link);
    print.println("<link href=https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css");




}
