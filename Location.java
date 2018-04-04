public class Location {

	private double x, y, z;
	
	public Location() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Location(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Location(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Location(Location location) {
		this.x = location.x;
		this.y = location.y;
		this.z = location.z;
	}
	
	/**@param location location to add*/
	public void add(Location location) {
		this.x += location.x;
		this.y += location.y;
		this.z += location.z;
	}
	
	/**@return x value location*/
	public double getX() {
		return this.x;
	}
	
	/**@return y value location*/
	public double getY() {
		return this.y;
	}
	
	/**@return z value location*/
	public double getZ() {
		return this.z;
	}
	
	/**@param x set the x value*/
	public void setX(double x) {
		this.x = x;
	}
	
	/**@param y set the x value*/
	public void setY(double y) {
		this.y = y;
	}
	
	/**@param z set the x value*/
	public void setZ(double z) {
		this.z = z;
	}
	
	/**@param x amount of x to add
	 * @param y amount of y to add
	 * @param z amount of z to add*/
	public void add(double x, double y, double z) {
		this.x += x;
		this.y += y;
		this.z += z;
	}
	
	/**@param x amount of x to add*/
	public void addX(double x) {
		this.x += x;
	}
	
	/**@param y amount of y to add*/
	public void addY(double y) {
		this.y += y;
	}
	
	/**@param z amount of z to add*/
	public void addZ(double z) {
		this.z += z;
	}
	
	/**@param x x factor
	 * @param y y factor
	 * @param z z factor*/
	public void multiplicate(double x, double y, double z) {
		this.x *= x;
		this.y *= y;
		this.z *= z;
	}
	
	/**@param x x factor
	 * @param y y factor
	 * @param z z factor*/
	public void divide(double x, double y, double z) {
		this.x /= x;
		this.y /= y;
		this.z /= z;
	}
}
