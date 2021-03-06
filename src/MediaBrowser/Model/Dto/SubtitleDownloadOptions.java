package MediaBrowser.Model.Dto;

public class SubtitleDownloadOptions
{
	/** 
	 Gets or sets the item identifier.
	 
	 <value>The item identifier.</value>
	*/
	private String privateItemId;
	public final String getItemId()
	{
		return privateItemId;
	}
	public final void setItemId(String value)
	{
		privateItemId = value;
	}

	/** 
	 Gets or sets the media source identifier.
	 
	 <value>The media source identifier.</value>
	*/
	private String privateMediaSourceId;
	public final String getMediaSourceId()
	{
		return privateMediaSourceId;
	}
	public final void setMediaSourceId(String value)
	{
		privateMediaSourceId = value;
	}

	/** 
	 Gets or sets the index of the stream.
	 
	 <value>The index of the stream.</value>
	*/
	private int privateStreamIndex;
	public final int getStreamIndex()
	{
		return privateStreamIndex;
	}
	public final void setStreamIndex(int value)
	{
		privateStreamIndex = value;
	}

	/** 
	 Gets or sets the format.
	 
	 <value>The format.</value>
	*/
	private String privateFormat;
	public final String getFormat()
	{
		return privateFormat;
	}
	public final void setFormat(String value)
	{
		privateFormat = value;
	}
}