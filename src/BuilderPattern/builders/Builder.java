/**
 * 
 */
package BuilderPattern.builders;

import BuilderPattern.products.detailProduct.Engine;

/**
 * @author 002L2N744
 *
 */
public interface Builder {

	void reset();

	void setSeats(int num);

	void setEngine(Engine engine);

	void setTripComupter(int dist);

	void setGps(int lat, int lon);
	
	Object getResult();

}
