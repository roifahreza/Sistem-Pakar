
package jxl.common.log;

/**
 * Static structure containing the class name of the logger.  This may
 * be overwritten at build time if loggers other than the default,
 * no-dependency logger are required
 */
public class SimpleLoggerName
{
  public final static String NAME=jxl.common.log.SimpleLogger.class.getName();
}
