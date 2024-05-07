package io.github.kingdageek.core;

public interface Server {
    /**
     * Sets the interface used by the XMLRPC server (for internal communication
     * between unoserver and the other modules).
     * This defaults to "127.0.0.1" if not set
     * 
     * @param serverInterface
     * @returns self
     */
    Server setServerInterface(String serverInterface);

    /**
     * Set the port used by the XMLRPC server. This defaults to "2003"
     * 
     * @param port
     * @returns self
     */
    Server setPort(String port);

    /**
     * Sets the interface used by the LibreOffice server. Defaults to "2002"
     * 
     * @param unoInterface
     * @returns self
     */
    Server setUnoInterface(String unoInterface);

    /**
     * Daemonizes unoserver.
     * 
     * @returns self
     */
    Server makeDaemon();

    /**
     * Sets the path to the LibreOffice executable
     * 
     * @param libreOfficePath
     * @returns self
     */
    Server setLibreOfficePath(String libreOfficePath);

    /**
     * Sets the path to the LibreOffice user profile. Will default to a dyamically
     * created temporary directory.
     * 
     * @param userProfilePath
     * @returns self
     */
    Server setLibreOfficeUserProfilePath(String userProfilePath);

    /**
     * Sets the path to a file that the LibreOffice Process ID will be written to.
     * If unoserver is run as a daemon, this file will not be deleted when unoserver
     * exits
     * 
     * @param processIdFile
     * @returns self
     */
    Server setProcessIdFile(String processIdFile);
}
