package io.github.kingdageek.core;

public interface Compare {
    /**
     * Sets the file type/extension of the result output file (e.g. "pdf").
     * This is required when using stdout
     * 
     * @param fileType
     * @returns self
     */
    Compare setFileType(String fileType);

    /**
     * Sets the host used by the server, defaults to "127.0.0.1"
     * 
     * @param host
     * @returns self
     */
    Compare setHost(String host);

    /**
     * Sets the port used by the server, defaults to "2002"
     * 
     * @param port
     * @returns self
     */
    Server setPort(String port);

    /**
     * Sets the host location. This determines the handling of files and can only be
     * one of three values - `auto`, `remote`, and `local`.
     * If you run the client on the same machine as the server,
     * it can be set to `local`, and the files are sent as paths. If they are
     * different machines, it is `remote` and the files are sent as binary data.
     * Default is `auto`, and it will send the file as a path if the host is
     * `127.0.0.1` or `localhost`, and binary data for other hosts.
     * 
     * @param hostLocation
     * @returns self
     */
    Server setHostLocation(String hostLocation);

    /**
     * Sets the path to the older file to be compared with the original one (use -
     * for stdin)
     * 
     * @param oldFile
     * @returns self
     */
    Server setOldFile(String oldFile);

    /**
     * Sets the path to the newer file to be compared with the modified one (use -
     * for stdin)
     * 
     * @param newFile
     * @returns self
     */
    Server setNewFile(String newFile);

    /**
     * Sets the path to the result of the comparison and converted file (use - for
     * stdout)
     * 
     * @param outFile
     * @returns self
     */
    Server setOutFile(String outFile);
}
