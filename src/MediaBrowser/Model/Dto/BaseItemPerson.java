package MediaBrowser.Model.Dto;

import MediaBrowser.Model.Extensions.*;

/** 
 This is used by the api to get information about a Person within a BaseItem
*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DebuggerDisplay("Name = {Name}, Role = {Role}, Type = {Type}")] public class BaseItemPerson : IHasPropertyChangedEvent
public class BaseItemPerson implements IHasPropertyChangedEvent
{
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
	 Gets or sets the identifier.
	 
	 <value>The identifier.</value>
	*/
	private String privateId;
	public final String getId()
	{
		return privateId;
	}
	public final void setId(String value)
	{
		privateId = value;
	}

	/** 
	 Gets or sets the role.
	 
	 <value>The role.</value>
	*/
	private String privateRole;
	public final String getRole()
	{
		return privateRole;
	}
	public final void setRole(String value)
	{
		privateRole = value;
	}

	/** 
	 Gets or sets the type.
	 
	 <value>The type.</value>
	*/
	private String privateType;
	public final String getType()
	{
		return privateType;
	}
	public final void setType(String value)
	{
		privateType = value;
	}

	/** 
	 Gets or sets the primary image tag.
	 
	 <value>The primary image tag.</value>
	*/
	private String privatePrimaryImageTag;
	public final String getPrimaryImageTag()
	{
		return privatePrimaryImageTag;
	}
	public final void setPrimaryImageTag(String value)
	{
		privatePrimaryImageTag = value;
	}

	/** 
	 Gets a value indicating whether this instance has primary image.
	 
	 <value><c>true</c> if this instance has primary image; otherwise, <c>false</c>.</value>
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [IgnoreDataMember] public bool HasPrimaryImage
	public final boolean getHasPrimaryImage()
	{
		return getPrimaryImageTag() != null;
	}

	/** 
	 Occurs when [property changed].
	*/
//C# TO JAVA CONVERTER TODO TASK: Events are not available in Java:
//	public event PropertyChangedEventHandler PropertyChanged;
}