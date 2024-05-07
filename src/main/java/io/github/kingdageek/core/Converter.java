package io.github.kingdageek.core;

public interface Converter {

    /**
     * The file type/extension of the output file (ex pdf).
     * Required when using stdout
     * 
     * @param convertToFormat
     * @return
     */
    Converter setConvertTo(String convertToFormat);

    /**
     * The export filter to use when converting.
     * This is automatically selected if not specified
     * 
     * @param filter
     * @return self
     */
    Converter setFilter(String filter);

    /**
     * Attach an option for the export filter, in name=value format. Use true/false
     * for boolean values.
     * Can be repeated for multiple options. it is not always clear what options are
     * available, this depends on the version of LibreOffice. These filter options
     * are specific to the document format being exported to.
     * See details in the export filter section here:
     * https://manpages.ubuntu.com/manpages/trusty/man1/doc2odt.1.html
     * 
     * @param optionName
     * @param value
     * @returns self
     */
    Converter addFilterOption(String optionName, String value);

    /**
     * Attach an option for the export filter, in name=value format. Use true/false
     * for boolean values.
     * Can be repeated for multiple options. it is not always clear what options are
     * available, this depends on the version of LibreOffice. These filter options
     * are specific to the document format being exported to.
     * See details in the export filter section here:
     * https://manpages.ubuntu.com/manpages/trusty/man1/doc2odt.1.html
     * 
     * @param optionName
     * @param value
     * @returns self
     */
    Converter addFilterOption(String optionName, boolean value);

    /**
     * Attach an option for the export filter, in name=value format. Use true/false
     * for boolean values.
     * Can be repeated for multiple options. it is not always clear what options are
     * available, this depends on the version of LibreOffice. These filter options
     * are specific to the document format being exported to.
     * See details in the export filter section here:
     * https://manpages.ubuntu.com/manpages/trusty/man1/doc2odt.1.html
     * 
     * @param optionName
     * @param value
     * @returns self
     */
    Converter addFilterOption(String optionName, int value);

    /**
     * Sets the host used by the server, defaults to "127.0.0.1"
     * 
     * @param host
     * @returns self
     */
    Converter setHost(String host);

    /**
     * Sets the port used by the server, defaults to "2002"
     * 
     * @param port
     * @returns self
     */
    Converter setPort(String port);

    /**
     * Sets the host location. This determines the handling of files and can only be
     * one of three values - `auto`, `remote`, and `local`. If you run the client on
     * the same machine as the server, it can be set to `local`,
     * and the files are sent as paths. If they are different machines, it is
     * `remote` and the files are sent as binary data.
     * Default is `auto`, and it will send the file as a path if the host is
     * `127.0.0.1` or `localhost`, and binary data for other hosts.
     * 
     * @param hostLocation
     * @returns Converter
     */
    Converter setHostLocation(String hostLocation);

    /**
     * Sets the path to the file to be converted (use - for stdin)
     * 
     * @param inFile
     * @returns self
     */
    Converter setInFile(String inFile);

    /**
     * Sets the path to the converted file (use - for stdout)
     * 
     * @param outFile
     * @returns self
     */
    Converter setOutFile(String outFile);
}
