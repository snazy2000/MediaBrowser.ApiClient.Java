package MediaBrowser.Model.Dto;

import MediaBrowser.Model.Extensions.*;

/** 
 Class ChapterInfo
*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DebuggerDisplay("Name = {Name}")] public class ChapterInfoDto : IHasPropertyChangedEvent
public class ChapterInfoDto implements IHasPropertyChangedEvent
{
	/** 
	 Gets or sets the start position ticks.
	 
	 <value>The start position ticks.</value>
	*/
	private long privateStartPositionTicks;
	public final long getStartPositionTicks()
	{
		return privateStartPositionTicks;
	}
	public final void setStartPositionTicks(long value)
	{
		privateStartPositionTicks = value;
	}

	/** 
	 Gets or sets the name.
	 
	 <value>The name.</value>
	*/
	private String privateName;
	public final String getName()
	{
		return privateName;
	}
	public final void setName(String value)
	{
		privateName = value;
	}

	/** 
	 Gets or sets the image tag.
	 
	 <value>The image tag.</value>
	*/
	private String privateImageTag;
	public final String getImageTag()
	{
		return privateImageTag;
	}
	public final void setImageTag(String value)
	{
		privateImageTag = value;
	}

	/** 
	 Gets a value indicating whether this instance has image.
	 
	 <value><c>true</c> if this instance has image; otherwise, <c>false</c>.</value>
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [IgnoreDataMember] public bool HasImage
	public final boolean getHasImage()
	{
		return getImageTag() != null;
	}

//C# TO JAVA CONVERTER TODO TASK: Events are not available in Java:
//	public event PropertyChangedEventHandler PropertyChanged;
}