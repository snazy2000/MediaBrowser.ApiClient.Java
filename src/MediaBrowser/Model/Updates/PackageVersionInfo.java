package MediaBrowser.Model.Updates;

/** 
 Class PackageVersionInfo
*/
public class PackageVersionInfo
{
	/** 
	 Gets or sets the name.
	 
	 <value>The name.</value>
	*/
	private String privatename;
	public final String getname()
	{
		return privatename;
	}
	public final void setname(String value)
	{
		privatename = value;
	}

	/** 
	 Gets or sets the guid.
	 
	 <value>The guid.</value>
	*/
	private String privateguid;
	public final String getguid()
	{
		return privateguid;
	}
	public final void setguid(String value)
	{
		privateguid = value;
	}

	/** 
	 Gets or sets the version STR.
	 
	 <value>The version STR.</value>
	*/
	private String privateversionStr;
	public final String getversionStr()
	{
		return privateversionStr;
	}
	public final void setversionStr(String value)
	{
		privateversionStr = value;
	}

	/** 
	 Gets or sets the classification.
	 
	 <value>The classification.</value>
	*/
	private PackageVersionClass privateclassification = PackageVersionClass.values()[0];
	public final PackageVersionClass getclassification()
	{
		return privateclassification;
	}
	public final void setclassification(PackageVersionClass value)
	{
		privateclassification = value;
	}

	/** 
	 Gets or sets the description.
	 
	 <value>The description.</value>
	*/
	private String privatedescription;
	public final String getdescription()
	{
		return privatedescription;
	}
	public final void setdescription(String value)
	{
		privatedescription = value;
	}

	/** 
	 Gets or sets the required version STR.
	 
	 <value>The required version STR.</value>
	*/
	private String privaterequiredVersionStr;
	public final String getrequiredVersionStr()
	{
		return privaterequiredVersionStr;
	}
	public final void setrequiredVersionStr(String value)
	{
		privaterequiredVersionStr = value;
	}

	/** 
	 Gets or sets the source URL.
	 
	 <value>The source URL.</value>
	*/
	private String privatesourceUrl;
	public final String getsourceUrl()
	{
		return privatesourceUrl;
	}
	public final void setsourceUrl(String value)
	{
		privatesourceUrl = value;
	}

	/** 
	 Gets or sets the source URL.
	 
	 <value>The source URL.</value>
	*/
	private String privatechecksum;
	public final String getchecksum()
	{
		return privatechecksum;
	}
	public final void setchecksum(String value)
	{
		privatechecksum = value;
	}

	/** 
	 Gets or sets the target filename.
	 
	 <value>The target filename.</value>
	*/
	private String privatetargetFilename;
	public final String gettargetFilename()
	{
		return privatetargetFilename;
	}
	public final void settargetFilename(String value)
	{
		privatetargetFilename = value;
	}
}