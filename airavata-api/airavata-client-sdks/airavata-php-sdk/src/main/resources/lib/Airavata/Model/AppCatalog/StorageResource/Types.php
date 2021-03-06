<?php
namespace Airavata\Model\AppCatalog\StorageResource;

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;


/**
 * Storage Resource Description
 * 
 * storageResourceId: Airavata Internal Unique Identifier to distinguish Compute Resource.
 * 
 * hostName:
 *   Fully Qualified Host Name.
 * 
 * storageResourceDescription:
 *  A user friendly description of the resource.
 * 
 * 
 * DataMovementProtocol:
 *  Option to specify a prefered data movement mechanism of the available options.
 * 
 * 
 */
class StorageResourceDescription {
  static $_TSPEC;

  /**
   * @var string
   */
  public $storageResourceId = "DO_NOT_SET_AT_CLIENTS";
  /**
   * @var string
   */
  public $hostName = null;
  /**
   * @var string
   */
  public $storageResourceDescription = null;
  /**
   * @var bool
   */
  public $enabled = null;
  /**
   * @var \Airavata\Model\Data\Movement\DataMovementInterface[]
   */
  public $dataMovementInterfaces = null;
  /**
   * @var int
   */
  public $creationTime = null;
  /**
   * @var int
   */
  public $updateTime = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'storageResourceId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'hostName',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'storageResourceDescription',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'enabled',
          'type' => TType::BOOL,
          ),
        5 => array(
          'var' => 'dataMovementInterfaces',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\Airavata\Model\Data\Movement\DataMovementInterface',
            ),
          ),
        6 => array(
          'var' => 'creationTime',
          'type' => TType::I64,
          ),
        7 => array(
          'var' => 'updateTime',
          'type' => TType::I64,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['storageResourceId'])) {
        $this->storageResourceId = $vals['storageResourceId'];
      }
      if (isset($vals['hostName'])) {
        $this->hostName = $vals['hostName'];
      }
      if (isset($vals['storageResourceDescription'])) {
        $this->storageResourceDescription = $vals['storageResourceDescription'];
      }
      if (isset($vals['enabled'])) {
        $this->enabled = $vals['enabled'];
      }
      if (isset($vals['dataMovementInterfaces'])) {
        $this->dataMovementInterfaces = $vals['dataMovementInterfaces'];
      }
      if (isset($vals['creationTime'])) {
        $this->creationTime = $vals['creationTime'];
      }
      if (isset($vals['updateTime'])) {
        $this->updateTime = $vals['updateTime'];
      }
    }
  }

  public function getName() {
    return 'StorageResourceDescription';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->storageResourceId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->hostName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->storageResourceDescription);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::BOOL) {
            $xfer += $input->readBool($this->enabled);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::LST) {
            $this->dataMovementInterfaces = array();
            $_size0 = 0;
            $_etype3 = 0;
            $xfer += $input->readListBegin($_etype3, $_size0);
            for ($_i4 = 0; $_i4 < $_size0; ++$_i4)
            {
              $elem5 = null;
              $elem5 = new \Airavata\Model\Data\Movement\DataMovementInterface();
              $xfer += $elem5->read($input);
              $this->dataMovementInterfaces []= $elem5;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->creationTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->updateTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('StorageResourceDescription');
    if ($this->storageResourceId !== null) {
      $xfer += $output->writeFieldBegin('storageResourceId', TType::STRING, 1);
      $xfer += $output->writeString($this->storageResourceId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->hostName !== null) {
      $xfer += $output->writeFieldBegin('hostName', TType::STRING, 2);
      $xfer += $output->writeString($this->hostName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->storageResourceDescription !== null) {
      $xfer += $output->writeFieldBegin('storageResourceDescription', TType::STRING, 3);
      $xfer += $output->writeString($this->storageResourceDescription);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->enabled !== null) {
      $xfer += $output->writeFieldBegin('enabled', TType::BOOL, 4);
      $xfer += $output->writeBool($this->enabled);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->dataMovementInterfaces !== null) {
      if (!is_array($this->dataMovementInterfaces)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('dataMovementInterfaces', TType::LST, 5);
      {
        $output->writeListBegin(TType::STRUCT, count($this->dataMovementInterfaces));
        {
          foreach ($this->dataMovementInterfaces as $iter6)
          {
            $xfer += $iter6->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->creationTime !== null) {
      $xfer += $output->writeFieldBegin('creationTime', TType::I64, 6);
      $xfer += $output->writeI64($this->creationTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->updateTime !== null) {
      $xfer += $output->writeFieldBegin('updateTime', TType::I64, 7);
      $xfer += $output->writeI64($this->updateTime);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}


