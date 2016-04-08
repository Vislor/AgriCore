/*
 */
package com.agricraft.agricore.util.defaults;

import com.agricraft.agricore.util.AgriLogger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RlonRyan
 */
public class AgriDefaultLogger implements AgriLogger {

	public static final Logger logger = Logger.getLogger("AgriCore");

	@Override
	public void log(Object level, Object object) {
		if (level instanceof Level) {
			logger.log((Level) level, String.valueOf(object));
		} else {
			logger.log(Level.WARNING, String.valueOf(object));
		}
	}

	@Override
	public void all(Object object) {
		log(Level.ALL, object);
	}

	@Override
	public void severe(Object object) {
		log(Level.SEVERE, object);
	}

	@Override
	public void info(Object object) {
		log(Level.INFO, object);
	}

	@Override
	public void warn(Object object) {
		log(Level.WARNING, object);
	}

	@Override
	public void debug(Object object) {
		log(Level.INFO, "[AGRI-DEBUG] " + object);
	}

	@Override
	public void trace(Exception e) {
		debug(e);
	}

}