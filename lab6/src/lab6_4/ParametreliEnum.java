/**
 * 
 */
package lab6_4;

/**
 * @author Yusuf
 *
 */

public enum ParametreliEnum {
	Google("aa",2), Gokhan("gokhanaltan.com",3), ISTE("www.iste.edu.tr",4);
	
	private String url;
	private int x;
	ParametreliEnum(String url,int x){
		this.url=url;
		this.x = x;
	}
	
	public String urlGoster() {
		return this.url;
	}
}